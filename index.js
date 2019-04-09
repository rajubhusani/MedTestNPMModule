
import { NativeModules } from 'react-native';

const { RNMedTestLibrary } = NativeModules;

export default {
    displayToast: function() {
      return RNMedTestLibrary.displayToast();
    }
};
