import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IrrigationRules } from './irrigation-rules';

describe('IrrigationRules', () => {
  let component: IrrigationRules;
  let fixture: ComponentFixture<IrrigationRules>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IrrigationRules],
    }).compileComponents();

    fixture = TestBed.createComponent(IrrigationRules);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
