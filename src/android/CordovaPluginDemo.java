package info.andriodabcd.plugin.smit;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaPluginDemo extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        }else if(action.equals("substract")){
            this.substract(args, callbackContext);
            return true;
        }

        return false;
    }

    private void add (JSONArray args, CallbackContext callbackContext) {
        if (args != null) {
            try {
                int p1 = Integer.parseInt(args.getJsonObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJsonObject(1).getString("param2"));
                int result = p1 + p2;
                callbackContext.success("Result: " + result);
            } catch (JSONException e) {
                callbackContext.error("Try Again!!" + e);
            }
        } else {
            callbackContext.error("Invalid arguments");
        }
    }
    private void substract (JSONArray args, CallbackContext callbackContext) {
        if (args != null) {
            try {
                int p1 = Integer.parseInt(args.getJsonObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJsonObject(1).getString("param2"));
                int result = p1 - p2;
                callbackContext.success("Result: " + result);
            } catch (JSONException e) {
                callbackContext.error("Try Again!!" + e);
            }
        } else {
            callbackContext.error("Invalid arguments");
        }
    }
}

