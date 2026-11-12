import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IrrigationRecords } from './irrigation-records';

describe('IrrigationRecords', () => {
  let component: IrrigationRecords;
  let fixture: ComponentFixture<IrrigationRecords>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IrrigationRecords],
    }).compileComponents();

    fixture = TestBed.createComponent(IrrigationRecords);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
