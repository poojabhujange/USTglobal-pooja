import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor',
  templateUrl: './ngfor.component.html',
  styleUrls: ['./ngfor.component.css']
})
export class NgforComponent implements OnInit {
  products=[
    {
      img:"https://cdn.pixabay.com/photo/2016/12/06/18/27/milk-1887234__340.jpg",
      name:"milk",
      price:40
    },
    {
      img:"https://cdn.pixabay.com/photo/2019/03/18/08/29/nuts-4062624__340.jpg",
      name:"walnuts",
      price:70
    },
    {
      img:"https://cdn.pixabay.com/photo/2016/06/11/04/09/butter-1449453__340.jpg",
      name:"butter",
      price:100
    }
  ]

  constructor() { }

  ngOnInit() {
  }

}
