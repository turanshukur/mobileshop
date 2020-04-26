import { Injectable, OnInit } from "@angular/core";
import { RestService } from "./rest.service";
import { Category } from "./Category.model";

@Injectable()
export class CategoryRepository implements OnInit {
  categories: Category[] = [];

  constructor(private restService: RestService) {
    this.restService
      .getCategories()
      .subscribe((categories) => (this.categories = categories));
  }

  ngOnInit() {}

  getCategory(id: number): Category {
    return this.categories.find((i) => i.id === id);
  }

  getCategories(): Category[] {
    return this.categories;
  }
}
