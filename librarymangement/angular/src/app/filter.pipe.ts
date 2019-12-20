
import {Pipe, PipeTransform } from '@angular/core';

@Pipe({
    name: 'filter'
})

export class FilterPipe implements PipeTransform{
    transform(books: any, search: any): any[] {
        if(search === undefined) {
            return books;
        // tslint:disable-next-line:one-line
        } else{
            return books.filter((value, index, array) =>{
                return value.name.toLowerCase().includes(search.toLowerCase());
            });
        }

    }
}