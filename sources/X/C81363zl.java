package X;

import android.content.ContentValues;

/* renamed from: X.3zl  reason: invalid class name and case insensitive filesystem */
public final class C81363zl extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ long $messageRowId;
    public final /* synthetic */ C108895dj $uniqueIdEnforced;
    public final /* synthetic */ AnonymousClass30J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81363zl(AnonymousClass30J r2, C108895dj r3, long j) {
        super(0);
        this.$uniqueIdEnforced = r3;
        this.this$0 = r2;
        this.$messageRowId = j;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ContentValues A06 = AnonymousClass0x9.A06();
        A06.put("crossposting_status_unique_id", (String) this.$uniqueIdEnforced.A00("XFAM_CROSSPOSTING_DB_SQL"));
        this.this$0.A02(A06, C18280x3.A0j(this.$messageRowId));
        return C59022wD.A00;
    }
}
