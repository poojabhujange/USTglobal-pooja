import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCar;
  Cars = [
    {
      name : 'Sports car',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png'
    },
    {
      name : 'Old car',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/05/28/car-1957037__340.jpg'
    },
    {
      name : 'Corvette',
      imgUrl : 'https://cdn.pixabay.com/photo/2013/08/11/03/40/corvette-171422__340.jpg'
    },
    {
      name : 'Benz',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
    this.selectedCar = car;
    console.log(car);
  }

}
