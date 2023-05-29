var exec = require('cordova/exec');

module.exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'CordovaPluginDemo', 'coolMethod', [arg0]);
};

module.exports.add = function (arg0, success, error) 
{ 
    exec(success, error, 'CordovaPluginDemo', 'add', [arg0]);
}

module.exports.subtraction = function (arg0, success, error)
{
    
}
