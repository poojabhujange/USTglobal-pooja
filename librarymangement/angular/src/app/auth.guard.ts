import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class AuthGuard implements CanActivate {

    canActivate(route:ActivatedRouteSnapshot): boolean {
        const roleArray = route.data.roles;
        const userDetails = JSON.parse(localStorage.getItem('userDetails'));
        let expectedRole: string;
        for(const index in roleArray) {
            if(userDetails && userDetails.assetBean.role === roleArray[index]){
                expectedRole = roleArray[index];
            }
        }
        if (userDetails && expectedRole === userDetails.assetBean.role){
            console.log('user Authenticated')
            return true;
        } else {
            console.log('not Authenticated');
            return false;
        }
    }

}