
package com.reactlibrary;

import android.app.Activity;
import android.app.Application;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;

public class RNMedTestLibraryModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private Application mActivity;

  public RNMedTestLibraryModule(ReactApplicationContext reactContext, Application activity) {
    super(reactContext);
    this.reactContext = reactContext;
    this.mActivity = activity;
  }

  @Override
  public String getName() {
    return "MedTestLibrary";
  }

  @ReactMethod
  public void initializeSDK(String apiKey){
    MedalliaDigital.init(mActivity, apiKey, new MDResultCallback() {
      @Override
      public void onSuccess() {
        Toast.makeText(reactContext, "Medallia SDK init Success", Toast.LENGTH_LONG).show();
      }

      @Override
      public void onError(MDExternalError error) {
        Toast.makeText(reactContext, "Medallia SDK init Failed", Toast.LENGTH_LONG).show();
      }
    });
  }

  @ReactMethod
  public void showForm(String formId){
    MedalliaDigital.showForm(formId, new MDResultCallback() {
      @Override
      public void onSuccess() {
        Toast.makeText(reactContext, "Medallia form Success", Toast.LENGTH_LONG).show();
      }

      @Override
      public void onError(MDExternalError error) {
        Toast.makeText(reactContext, "Medallia form Failed"+error.getMessage(), Toast.LENGTH_LONG).show();
      }
    });
  }
}