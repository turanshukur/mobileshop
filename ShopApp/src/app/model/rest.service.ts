import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Product } from "./Product.model";
import { Observable } from "rxjs";
import { Category } from "./category.model";
@Injectable({
  providedIn: "root",
})
export class RestService {
  baseUrl: String = "http://localhost:8080/";

  constructor(private httpClient: HttpClient) {}

  getProducts(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.baseUrl + "products");
  }

  getCategories(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(this.baseUrl + "categories");
  }
}
