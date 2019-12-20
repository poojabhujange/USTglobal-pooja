import { Component, OnInit } from '@angular/core';
import { AuthServiceService } from '../auth-service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-requestbook',
  templateUrl: './requestbook.component.html',
  styleUrls: ['./requestbook.component.css']
})
export class RequestbookComponent implements OnInit {
  error: any;

  constructor(private auth: AuthServiceService) { }

  ngOnInit() {
  }
  issuebook(book) {
    console.log(book);
    this.auth.requestBook(book).subscribe(data => {
     console.log('requested for issue book');
     console.log(data);
    }, err => {
      console.log('failed');
    }, () => {
      console.log('data');
    });
  }

}
