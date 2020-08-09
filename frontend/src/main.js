import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify';
import VueRouter from 'vue-router';
import {routes} from './routes';
import VueNumber from "vue-number-animation";


Vue.config.productionTip = false
Vue.use(VueNumber);
Vue.use(VueRouter);
const router = new VueRouter({
  routes
});
new Vue({
  vuetify,
  router,
  render: h => h(App)
}).$mount('#app')
