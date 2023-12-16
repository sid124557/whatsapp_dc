package X;

import android.content.res.Resources;
import android.os.Handler;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.util.Log;

/* renamed from: X.3Lx  reason: invalid class name and case insensitive filesystem */
public class C66563Lx implements C184318rb {
    public final Resources A00;
    public final Handler A01 = AnonymousClass000.A0A();
    public final int[] A02;
    public final /* synthetic */ C114085mT A03;

    public /* bridge */ /* synthetic */ void BZS(Object obj) {
        C94274qr r3 = new C94274qr(this.A02);
        long A002 = EmojiDescriptor.A00(r3, false);
        this.A01.post(new C70283aF(this, this.A03.A0F.A02(this.A00, (C184318rb) null, r3, A002), 11, A002));
    }

    public C66563Lx(Resources resources, C114085mT r3, int[] iArr) {
        this.A03 = r3;
        this.A02 = iArr;
        this.A00 = resources;
    }

    public void BRy() {
        Log.d("GroupProfileEmojiEditorKeyboardController/getEmojiHighRes/Failed to fetch high res emoji version.");
    }
}
