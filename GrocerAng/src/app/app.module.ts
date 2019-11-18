import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GrocerylistComponent } from './grocerylist/grocerylist.component';
import { GrocerylistsComponent } from './grocerylists/grocerylists.component';

@NgModule({
  declarations: [
    AppComponent,
    GrocerylistComponent,
    GrocerylistsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
