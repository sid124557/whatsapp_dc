package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.15e  reason: invalid class name */
public final class AnonymousClass15e extends C88674aZ {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ AnonymousClass30E A03;
    public final /* synthetic */ AnonymousClass217 A04;
    public final /* synthetic */ C73263fC A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;

    public AnonymousClass15e(Context context, AnonymousClass30E r2, AnonymousClass217 r3, C73263fC r4, String str, List list, List list2, int i) {
        this.A03 = r2;
        this.A02 = context;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = list;
        this.A06 = str;
        this.A08 = list2;
        this.A01 = i;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj, int i) {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass356.A01(AnonymousClass000.A0Y("CrosspostManager/handleAutoCrosspostErrorWithSnackBarMessage/snackbar_callback event: ", AnonymousClass001.A0o(), i));
            this.A03.A07.A01(this.A02, this.A05, "status_fragment", this.A06, this.A07, this.A08, this.A01);
        }
    }
}
