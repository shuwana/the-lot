import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { map, Observable } from "rxjs";
import { Pricing } from "../model/pricing-model";


@Injectable({
    providedIn: 'root'
})

export class PricingService {
    // Endpoint for pricing data
    private baseUrl = 'http://localhost:8080'

    constructor(private http: HttpClient) { }

    getPricingList(): Observable<Pricing[]> {
        return this.http.get<GetResponse>(this.baseUrl).pipe(
            map(response => response._embedded.prices)
          );
    }
}

interface GetResponse {
    _embedded: {
      prices: Pricing[];
    }
  }