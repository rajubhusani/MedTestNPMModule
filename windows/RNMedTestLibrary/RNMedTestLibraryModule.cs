using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Med.Test.Library.RNMedTestLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNMedTestLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNMedTestLibraryModule"/>.
        /// </summary>
        internal RNMedTestLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNMedTestLibrary";
            }
        }
    }
}
