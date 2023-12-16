package com.whatsapp.pytorch;

import X.AnonymousClass000;
import X.AnonymousClass001;
import com.facebook.soloader.SoLoader;
import com.whatsapp.util.Log;

public class WhatsAppDynamicPytorchLoader {
    public static long A00;
    public static boolean A01;

    public static native void loadDynamicPytorchSymbols();

    public static void A00() {
        if (!A01) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                SoLoader.A07("dynamic_pytorch_impl", 16);
                SoLoader.A07("torch-code-gen", 16);
                Log.d("WhatsAppDynamicPytorchLoader/Successfully load dynamic pytorch libraries");
                loadDynamicPytorchSymbols();
                A01 = true;
            } catch (Throwable th) {
                Log.e(AnonymousClass000.A0a("WhatsAppDynamicPytorchLoader/Failed to load dynamic pytorch libraries: ", AnonymousClass001.A0o(), th));
            }
            A00 = System.currentTimeMillis() - currentTimeMillis;
        }
    }
}
