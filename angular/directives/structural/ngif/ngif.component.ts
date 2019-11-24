import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngif',
  templateUrl: './ngif.component.html',
  styleUrls: ['./ngif.component.css']
})
export class NgifComponent implements OnInit {
  show : boolean =false;

  constructor() { 
    setTimeout(()=>
    {
      this.show=true;
    },2000)
  }

  ngOnInit() {
  }

}
