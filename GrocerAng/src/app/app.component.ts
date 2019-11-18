import { Component } from '@angular/core';
import grocery from './grocery';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'groceries';
  groceries: grocery[] = [
    {
      item_id: 1,
      item_type: 'food',
      item_name: 'string beans',
      item_list: 1
    },
    {
      item_id: 2,
      item_type: 'electronics',
      item_name: 'hair dryer',
      item_list: 1
    },
    {
      item_id: 3,
      item_type: 'hygiene',
      item_name: 'toothbrush',
      item_list: 1
    },
    {
      item_id: 4,
      item_type: 'food',
      item_name: 'ham',
      item_list: 2
    },
    {
      item_id: 5,
      item_type: 'food',
      item_name: 'turkey',
      item_list: 2
    },
    {
      item_id: 6,
      item_type: 'electronics',
      item_name: 'quadcopter drone',
      item_list: 2
    },
    {
      item_id: 7,
      item_type: 'other',
      item_name: 'plunger',
      item_list: 2
    }
  ];
}
