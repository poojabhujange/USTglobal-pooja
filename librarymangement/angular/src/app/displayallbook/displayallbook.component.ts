import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { AuthServiceService } from '../auth-service.service';

@Component({
  selector: 'app-displayallbook',
  templateUrl: './displayallbook.component.html',
  styleUrls: ['./displayallbook.component.css']
})
export class DisplayallbookComponent implements OnInit {
  books: any;
  constructor( private http: HttpClient, private auth: AuthServiceService) {
    this.getData();
  }


   getData() {
    this.http.get<any>('http://localhost:8084/librarymanagment/get-all').subscribe(data => {
      console.log(data);
      this.books = data.bookb;
    });
  }


  

  ngOnInit() {
  }

}
