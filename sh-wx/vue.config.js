const path = require('path')

function resolve(dir) {
  return path.join(__dirname, dir)
}

const name = 'sh-wechat管理平台'

const port = process.env.port || process.env.npm_config_port || 8692

module.exports = {
  publicPath: './',
  outputDir: 'dist',
  assetsDir: 'static',
  lintOnSave: process.env.NODE_ENV === 'development',
  productionSourceMap: false,
  devServer: {
    port: port,
    open: true,
    overlay: {
      warnings: false,
      errors: true
    }
  },
  configureWebpack: {
    name: name,
    resolve: {
      alias: {
        '@': resolve('src')
      }
    }
  },
}