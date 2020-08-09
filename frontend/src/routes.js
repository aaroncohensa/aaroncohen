import Calendar from './components/CalendarPage.vue';
import Home from './components/HomePage.vue';
import Schedule from './components/SchedulePage.vue';
import About from './components/AboutPage.vue';


export const routes = [
    {path: '' , component: Home},
    {path: '/calendar' , component: Calendar},
    {path: '/schedule' , component: Schedule},
    {path: '/about' , component: About} 
];