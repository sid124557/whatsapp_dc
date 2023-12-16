package X;

/* renamed from: X.3J3  reason: invalid class name */
public class AnonymousClass3J3 implements AnonymousClass4ED {
    public /* synthetic */ void B3g(C56862sg r3, C41492Kl r4, C56622sI r5) {
        r5.A0B("mms_thumbnail_metadata_transferred_index", " CREATE INDEX IF NOT EXISTS mms_thumbnail_metadata_transferred_index ON mms_thumbnail_metadata(transferred)");
    }

    public void B3j(C41492Kl r7, C56622sI r8) {
        C54912pU A00 = C54912pU.A00();
        C59422wt[] r3 = new C59422wt[12];
        AnonymousClass220 A02 = AnonymousClass220.A02(A00);
        boolean A0o = C54912pU.A0o(A00, A02, r3);
        A00.A02 = "direct_path";
        AnonymousClass220 r2 = AnonymousClass220.TEXT;
        C54912pU.A0b(A00, r2, r3, A0o ? 1 : 0);
        A00.A02 = "media_key";
        AnonymousClass220 r1 = AnonymousClass220.BLOB;
        C54912pU.A0Y(A00, r1, r3);
        C54912pU.A0B(A00, A02, "media_key_timestamp", r3);
        C54912pU.A0C(A00, r2, "enc_thumb_hash", r3);
        C54912pU.A0D(A00, r2, "thumb_hash", r3);
        C54912pU.A0E(A00, A02, "thumb_width", r3);
        C54912pU.A0F(A00, A02, "thumb_height", r3);
        C54912pU.A0G(A00, A02, "transferred", r3);
        C54912pU.A0H(A00, r1, "micro_thumbnail", r3);
        C54912pU.A0I(A00, A02, "insert_timestamp", r3);
        C54912pU.A0J(A00, r2, "handle", r3);
        r8.A0E("mms_thumbnail_metadata", r3);
    }

    public /* synthetic */ void B3l(C56862sg r4, C41492Kl r5, C56622sI r6) {
        C56622sI.A03(r6, "message", "mms_thumbnail_metadata", "message_row_id=old._id");
    }
}
