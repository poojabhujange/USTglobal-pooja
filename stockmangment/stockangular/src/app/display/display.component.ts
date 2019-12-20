import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { AuthServiceService } from '../auth.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent implements OnInit {
  products: any;
 

  constructor(private http: HttpClient, private auth: AuthServiceService) {
    this.getData();
   }

  ngOnInit() {
  }

  getData() {
    this.http.get<any>('http://localhost:8080/get-all').subscribe(data => {
      console.log(data);
      this.products = data.product;
    });
  }


  addcard(product){
    console.log(product)
    this.auth.addtocard(product).subscribe(data=>{
      console.log(' product is add');
    }, err=>{
      console.log('product is not add')
    },()=>{
      console.log('success');
    })
  }
}
