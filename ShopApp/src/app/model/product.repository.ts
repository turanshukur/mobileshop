import { Injectable, OnInit } from "@angular/core";
import { Product } from "./Product.model";
import { RestService } from "./rest.service";

@Injectable()
export class ProductRepository implements OnInit {
  products: Product[] = [];

  constructor(private restService: RestService) {
    this.restService
      .getProducts()
      .subscribe((products) => (this.products = products));
  }

  ngOnInit() {}

  getProduct(id: number): Product {
    return this.products.find((i) => i.id === id);
  }

  getProducts(): Product[] {
    return this.products;
  }
}
