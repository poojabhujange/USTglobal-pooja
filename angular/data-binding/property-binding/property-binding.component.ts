import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
  name : string = 'Nature';
  imgUrl : string = 'https://cdn.pixabay.com/photo/2017/11/04/11/25/fog-2917232__340.jpg';
  address : string = 'NH-206, Kadur-577548';
  colorName : string = 'blue';
  isActive : boolean = false;
  colspanValue : number = 2;

  constructor() { }

  ngOnInit() {
    setInterval(()=>{
      this.colorName='orange';
      this.isActive=!this.isActive;
    },2000);
  }

}
