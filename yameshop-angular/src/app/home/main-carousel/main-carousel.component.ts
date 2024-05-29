import { Component, OnInit } from '@angular/core';
import { homeCarouselData } from '../../../mainCarouselData';

@Component({
  selector: 'app-main-carousel',
  templateUrl: './main-carousel.component.html',
  styleUrl: './main-carousel.component.scss'
})
export class MainCarouselComponent implements OnInit {
  ngOnInit(): void {
    this.carouselData=homeCarouselData;
    this.autoPlay();
  }
  carouselData: any;
  currentSlide = 0;
  interval: any;

  autoPlay(){
    setInterval(()=>{
      this.nextSlide();
    }, 2000)
  }

  nextSlide(){
    this.currentSlide = this.currentSlide+1 % this.carouselData.length;
  }
}
