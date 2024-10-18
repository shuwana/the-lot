import { Component, OnInit } from '@angular/core';
import { PricingService } from '../service/pricing-api';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Pricing } from '../model/pricing-model';

@Component({
  selector: 'app-pricing',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './pricing.component.html',
  styleUrl: './pricing.component.css'
})
export class PricingComponent implements OnInit {
  currentPage: string = 'pricing';

  prices: Pricing[] = [];

  constructor(private api: PricingService, private router: Router){}

  ngOnInit(): void {
      this.loadPricingModel();
  }

  loadPricingModel(): void {
    this.api.getPricingList().subscribe(data =>{
      this.prices = data;
    });
  }
}
