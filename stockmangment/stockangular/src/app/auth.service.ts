import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {
  addtocard(book: any) {
    throw new Error("Method not implemented.");
  }

constructor(private http: HttpClient) { }

addstock(product): Observable<any> {
  return this.http.post(`http://localhost:8080/add-item`, product);
  }

updatestock(product): Observable<any> {
  return this.http.post(`http://localhost:8080/update`, product);
}

addcard (product): Observable<any> {
  return this.http.post(`http://localhost:8080/addtocard`,product);
}



}