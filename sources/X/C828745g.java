package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.45g  reason: invalid class name and case insensitive filesystem */
public final class C828745g extends C829045j implements AnonymousClass4GS {
    public final /* synthetic */ AnonymousClass1C2 $encCommentMessage;
    public final /* synthetic */ C52042kn $parentKeyExtended;
    public final /* synthetic */ AnonymousClass2NH this$0;

    public /* bridge */ /* synthetic */ Object BGj(Object obj, Object obj2, Object obj3) {
        Object obj4;
        UserJid userJid = (UserJid) obj;
        UserJid userJid2 = (UserJid) obj2;
        byte[] bArr = (byte[]) obj3;
        C162457s7.A0J(userJid, 0);
        C18260x0.A0Q(userJid2, bArr);
        byte[] A07 = this.$encCommentMessage.encPayload_.A07();
        byte[] A072 = this.$encCommentMessage.encIv_.A07();
        C162457s7.A0H(A072);
        C162457s7.A0H(A07);
        JniBridge jniBridge = this.this$0.A02;
        String str = this.$parentKeyExtended.A01.A01;
        C162457s7.A0C(str);
        byte[] A01 = C57512tl.A01(userJid, userJid2, jniBridge, str, "Enc Comment", A072, A07, (byte[]) null, bArr);
        if (A01 == null || A01.length == 0) {
            obj4 = AnonymousClass3Z0.A01(AnonymousClass24W.A00(0));
        } else {
            try {
                obj4 = AnonymousClass1EU.A00(A01);
            } catch (AnonymousClass6u5 e) {
                Log.e("CommentMessageEncryptionManager/Message was not decrypted successfully");
                throw new AnonymousClass24W((Exception) e, (Integer) 51);
            }
        }
        return new AnonymousClass3Z9(obj4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C828745g(AnonymousClass2NH r2, AnonymousClass1C2 r3, C52042kn r4) {
        super(3);
        this.$encCommentMessage = r3;
        this.this$0 = r2;
        this.$parentKeyExtended = r4;
    }
}
