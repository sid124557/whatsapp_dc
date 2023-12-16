package com.whatsapp.settings;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.C107695bk;
import X.C18310x6;
import X.C64333Db;
import X.C89644eZ;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Licenses extends C89644eZ {
    public boolean A00;

    public void A5r() {
        if (!this.A00) {
            this.A00 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
        }
    }

    public Licenses(int i) {
        this.A00 = false;
        AnonymousClass4HY.A00(this, 109);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream;
        super.onCreate(bundle);
        AnonymousClass1Hf.A2A(this);
        setContentView((int) R.layout.f8nameremoved);
        TextView A0L = C18310x6.A0L(this, R.id.licenses_view);
        try {
            InputStream openRawResource = getResources().openRawResource(R.raw.notices);
            try {
                int available = openRawResource.available();
                if (available <= 0) {
                    available = 32;
                }
                byteArrayOutputStream = new ByteArrayOutputStream(available);
                byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                while (true) {
                    int read = openRawResource.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                str = byteArrayOutputStream.toString();
                byteArrayOutputStream.close();
                openRawResource.close();
                if (str == null) {
                    str = getString(R.string.f11nameremoved);
                }
            } catch (Throwable th) {
                if (openRawResource != null) {
                    openRawResource.close();
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("licenses/cannot-load ", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        A0L.setText(str);
        return;
        throw th;
    }

    public Licenses() {
        this(0);
    }
}
