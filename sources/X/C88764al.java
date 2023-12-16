package X;

import android.content.Context;
import android.text.method.MovementMethod;
import android.view.View;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.4al  reason: invalid class name and case insensitive filesystem */
public class C88764al extends AnonymousClass6NB {
    public final /* synthetic */ C186518vU A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88764al(C153427bI r1, AnonymousClass84O r2, C186518vU r3) {
        super(r1, r2);
        this.A00 = r3;
    }

    public /* bridge */ /* synthetic */ Object A0M(View view, C153427bI r4, AnonymousClass84O r5, Object obj) {
        AnonymousClass03n r3 = (AnonymousClass03n) view;
        C186518vU r1 = this.A00;
        C159767mQ.A01(C159767mQ.A00(r4, r5, r1), r3, r4, r5, r1);
        C86654Ky.A1E(r3);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0O(View view, C153427bI r4, AnonymousClass84O r5, Object obj, Object obj2) {
        AnonymousClass03n r3 = (AnonymousClass03n) view;
        C86634Kw.A1I(r3);
        r3.setGravity(8388659);
        r3.setMovementMethod((MovementMethod) null);
        ((TextEmojiLabel) r3).setLinkHandler((C86964Mo) null);
    }

    public /* bridge */ /* synthetic */ Object B0R(Context context) {
        return new TextEmojiLabel(context);
    }
}
