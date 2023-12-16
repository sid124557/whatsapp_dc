package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.55S  reason: invalid class name */
public class AnonymousClass55S extends AnonymousClass5ZM {
    public int A00;
    public Bitmap A01;
    public Bitmap A02;
    public Uri A03;
    public AnonymousClass5UR A04;
    public final C103095Ln A05;

    public AnonymousClass55S(C003203q r2, C103095Ln r3) {
        super(r2, true);
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i;
        int i2;
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            i = -3;
        } else {
            Canvas A06 = AnonymousClass4L0.A06(bitmap);
            A06.drawColor(this.A00);
            A06.drawBitmap(this.A01, 0.0f, 0.0f, C86664Kz.A0Z());
            i = -1;
            OutputStream outputStream = null;
            try {
                AnonymousClass5UR r1 = this.A04;
                if (r1 == null) {
                    Log.w("GroupProfileEmojiEditor/render/bg contentResolver=null");
                } else {
                    outputStream = r1.A07(this.A03);
                }
                if (outputStream == null) {
                    i2 = -1;
                    C624535b.A03(outputStream);
                    return i2;
                }
                this.A02.compress(Bitmap.CompressFormat.JPEG, 85, outputStream);
                outputStream.flush();
                C624535b.A03(outputStream);
                if (!C18320x8.A1T(this)) {
                    i = 0;
                }
            } catch (IOException e) {
                if (C18320x8.A1T(this) || e.getMessage() == null || !C86624Kv.A1Z(e)) {
                    i2 = -1;
                } else {
                    i2 = -2;
                }
            } catch (Exception e2) {
                if (!C18320x8.A1T(this)) {
                    Log.e("GroupProfileEmojiEditor/render/bg/error", e2);
                }
                i2 = -1;
            } catch (Throwable th) {
                C624535b.A03(outputStream);
                throw th;
            }
        }
        return Integer.valueOf(i);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C15910sA A07 = A07(GroupProfileEmojiEditor.class);
        AnonymousClass6A7 r0 = new AnonymousClass6A7(obj, 2, this);
        if (A07 != null) {
            r0.AwB(A07);
        }
    }
}
