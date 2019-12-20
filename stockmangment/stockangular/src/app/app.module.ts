import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { AddstockComponent } from './addstock/addstock.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { UpdateComponent } from './update/update.component';
import { SearchComponent } from './search/search.component';
import { CardComponent } from './card/card.component';
import { HttpClientModule } from '@angular/common/http';
import { DisplayComponent } from './display/display.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    AddstockComponent,
    HeaderComponent,
    HomeComponent,
    UpdateComponent,
    SearchComponent,
    CardComponent,
    DisplayComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'addstock', component : AddstockComponent},
      {path : 'update', component : UpdateComponent},
      {path : 'search', component : SearchComponent},
      {path : 'card', component : CardComponent},
      {path : 'display', component : DisplayComponent},

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
