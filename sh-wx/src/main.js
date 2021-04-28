import Vue from 'vue'
import App from './App'
import router from './router'
import Cookies from 'js-cookie'
import ElementUI from 'element-ui'
import Avue from '@smallwei/avue'
import 'normalize.css/normalize.css'

import 'element-ui/lib/theme-chalk/index.css'
import '@smallwei/avue/lib/index.css'

Vue.use(ElementUI, {
  size: Cookies.get('size') || 'medium' // set element-ui default size
})

Vue.use(Avue)


Vue.config.productionTip = false

new Vue({
  el: '#app',
  router,
  render: h => h(App)
})