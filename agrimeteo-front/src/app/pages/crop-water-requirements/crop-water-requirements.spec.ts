import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CropWaterRequirements } from './crop-water-requirements';

describe('CropWaterRequirements', () => {
  let component: CropWaterRequirements;
  let fixture: ComponentFixture<CropWaterRequirements>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CropWaterRequirements],
    }).compileComponents();

    fixture = TestBed.createComponent(CropWaterRequirements);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
