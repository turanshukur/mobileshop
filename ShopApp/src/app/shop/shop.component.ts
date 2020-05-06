import { Component } from "@angular/core";
import { ProductRepository } from "../model/product.repository";
import { CategoryRepository } from "../model/category.repository";
import { Product } from "../model/Product.model";
import { Category } from "../model/Category.model";

@Component({
  selector: "shop",
  templateUrl: "shop.component.html",
  styles: [".pt-100 {padding-top:100px;}"],
})
export class ShopComponent {
  constructor(
    private productRepository: ProductRepository,
    private categoryRepository: CategoryRepository
  ) {}

  get products(): Product[] {
    return this.productRepository.getProducts();
  }

  get categories(): Category[] {
    return this.categoryRepository.getCategories();
  }
}
