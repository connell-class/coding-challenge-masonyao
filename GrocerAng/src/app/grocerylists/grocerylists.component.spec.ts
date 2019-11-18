import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GrocerylistsComponent } from './grocerylists.component';

describe('GrocerylistsComponent', () => {
  let component: GrocerylistsComponent;
  let fixture: ComponentFixture<GrocerylistsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GrocerylistsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GrocerylistsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
