/*
Copyright 2009-2010 Igor Polevoy 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/

package app.controllers;

import org.javalite.activeweb.AppController;
import app.services.Greeter;
import com.google.inject.Inject;


/**
 * @author Igor Polevoy
 */
public class InjectionController extends AppController {

    Greeter greeter;

    public void index(){
        respond("The greeting is: " + greeter.greet());
    }

    @Inject
    public void setGreeter( Greeter greeter) {
        this.greeter = greeter;
    }
}
