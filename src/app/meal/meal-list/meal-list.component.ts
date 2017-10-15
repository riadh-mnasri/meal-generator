import {Component, OnDestroy, OnInit} from '@angular/core';

import {Subscription} from 'rxjs/Rx';

@Component({
  selector: 'my-meals',
  templateUrl: './meal-list.component.html',
  styleUrls: ['./meal-list.component.scss']
})
export class MealListComponent implements OnInit, OnDestroy {
  meals: Array<any> = [];
  eventSubscriber: Subscription;

  constructor() {
  }

  ngOnInit() {
    this.loadAll();
    this.registerChangeInCampaigns();
  }

  loadAll() {
    this.campaignService.findAllCampaigns().subscribe(
      (res) => this.campaigns = res,
      (error) => console.log(error)
    );
  }

  deleteCampaign(id: number) {
    this.campaignService.delete(id).subscribe((response) => {
      this.loadAll();
    });
  }

  registerChangeInCampaigns() {
    this.eventSubscriber = this.eventManager.subscribe('campaignListModification', (response) => this.loadAll());
  }

  ngOnDestroy() {
    this.eventManager.destroy(this.eventSubscriber);
  }
}
