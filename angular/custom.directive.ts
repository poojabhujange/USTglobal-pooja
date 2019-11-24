import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';


@Directive({
    selector:'[custDir]'
})

export class CustomDirective {
    constructor(private el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'bisque';

    }
    @HostBinding('style.backgroundColor')color = 'pink';
    @HostListener('mouseenter')m(){
        this.el.nativeElement.style.backgroundColor = 'bisque';
    }
    @HostListener('mouseleave')m1(){
        this.el.nativeElement.style.backgroundColor = 'pink';
    }
}