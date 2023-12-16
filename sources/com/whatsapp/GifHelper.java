package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6z0;
import X.C107655bf;
import X.C18260x0;
import X.C56512s6;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

public class GifHelper {
    public static void A00(C56512s6 r5, File file) {
        AnonymousClass6z0 r1;
        try {
            File A03 = r5.A03(file);
            Mp4Ops.LibMp4OperationResult applyGifTag = applyGifTag(file.getAbsolutePath(), A03.getAbsolutePath());
            if (applyGifTag == null) {
                Log.e("gif-helper/applyGifTag is null");
                r1 = new AnonymousClass6z0(0, "result is null");
            } else if (!applyGifTag.success) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("gif-helper/applyGifTag");
                C18260x0.A1K(A0o, applyGifTag.errorMessage);
                int i = applyGifTag.errorCode;
                r1 = new AnonymousClass6z0(i, AnonymousClass000.A0Y("invalid result, error_code: ", AnonymousClass001.A0o(), i));
            } else if (C107655bf.A0c(r5, A03, file)) {
                Log.d("applyGifTag succeeded");
                return;
            } else {
                Log.e("gif-helper/applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
                r1 = new AnonymousClass6z0(0, "applyGifTag failed to apply tag properly.  Renaming marked file to original filepath unsuccessful");
            }
            throw r1;
        } catch (IOException e) {
            Log.e("Could not access file or failed to move files properly", e);
            throw new AnonymousClass6z0(0, "Could not access file or failed to move files properly");
        }
    }

    public static native Mp4Ops.LibMp4OperationResult applyGifTag(String str, String str2);

    public static native boolean hasGifTag(String str);

    public static boolean A01(File file) {
        if (file == null || !hasGifTag(file.getAbsolutePath())) {
            return false;
        }
        return true;
    }
}
