import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-searchbook',
  templateUrl: './searchbook.component.html',
  styleUrls: ['./searchbook.component.css']
})
export class SearchbookComponent implements OnInit {
  error: any;
  books: any;

  
  constructor(private auth: AuthServiceService,private router: Router,private http :HttpClient) {
   }
  
  ngOnInit() {
  }






  // getData() {
  //   this.http.get<any>('http://localhost:8084/librarymanagment/get-all').subscribe(data => {
  //     console.log(data);
  //     this.books = data.bookb;
  //   });
  // }

  submitData(form: NgForm) {
    this.error = null;
    this.auth.searchbook(form.value)
    .subscribe(res => {
      console.log(res);
      form.reset();
    }, err => {
      console.log(err);
      this.error = err.error.message;
    });

  }
}