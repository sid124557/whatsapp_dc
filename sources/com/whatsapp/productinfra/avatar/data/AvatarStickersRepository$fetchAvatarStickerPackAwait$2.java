package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1l0;
import X.AnonymousClass218;
import X.AnonymousClass28J;
import X.AnonymousClass28K;
import X.AnonymousClass28L;
import X.AnonymousClass2C4;
import X.AnonymousClass2SI;
import X.AnonymousClass32Z;
import X.AnonymousClass3SF;
import X.AnonymousClass3Z0;
import X.AnonymousClass3Z9;
import X.AnonymousClass4GR;
import X.C18260x0;
import X.C18270x1;
import X.C29721kz;
import X.C30091lq;
import X.C371721f;
import X.C41742Lk;
import X.C50612iT;
import X.C51932kc;
import X.C55782qu;
import X.C55862r2;
import X.C57682u2;
import X.C59022wD;
import X.C59762xR;
import X.C616131n;
import X.C633438w;
import X.C633538x;
import X.C67293Os;
import X.C73153f1;
import X.C75003pT;
import X.C84814Du;
import com.whatsapp.graphql.GraphqlRequest$postAwait$2;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchAvatarStickerPackAwait$2", f = "AvatarStickersRepository.kt", i = {0, 0}, l = {119}, m = "invokeSuspend", n = {"avatarSharedPreferences", "currentRevision"}, s = {"L$2", "L$3"})
public final class AvatarStickersRepository$fetchAvatarStickerPackAwait$2 extends C75003pT implements AnonymousClass4GR {
    public final /* synthetic */ boolean $defaultPack;
    public final /* synthetic */ Integer $qplInstanceKey;
    public final /* synthetic */ Set $stableIds;
    public final /* synthetic */ Integer $stickerPackDownloadOrigin;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ C59762xR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchAvatarStickerPackAwait$2(C59762xR r2, Integer num, Integer num2, Set set, C84814Du r6, boolean z) {
        super(r6, 2);
        this.$qplInstanceKey = num;
        this.this$0 = r2;
        this.$stickerPackDownloadOrigin = num2;
        this.$stableIds = set;
        this.$defaultPack = z;
    }

    public final Object A09(Object obj) {
        Object obj2;
        Number number;
        C59762xR r8;
        C51932kc r1;
        String str;
        AnonymousClass28J r12;
        C371721f r14;
        Object obj3 = obj;
        AnonymousClass218 r7 = AnonymousClass218.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C57682u2.A01(obj3);
            number = this.$qplInstanceKey;
            r8 = this.this$0;
            Integer num = this.$stickerPackDownloadOrigin;
            Set set = this.$stableIds;
            boolean z = this.$defaultPack;
            boolean z2 = false;
            if (number != null) {
                try {
                    int intValue = number.intValue();
                    C55782qu r13 = (C55782qu) r8.A04.get();
                    C30091lq r0 = C30091lq.A00;
                    r13.A01.markerAnnotate(354170068, intValue, r0.A00, AnonymousClass000.A1S(z ? 1 : 0));
                } catch (Throwable th) {
                    AnonymousClass3Z0 A01 = AnonymousClass3Z0.A01(th);
                    C59762xR r15 = this.this$0;
                    Throwable A00 = AnonymousClass3Z9.A00(A01);
                    if (A00 == null) {
                        return A01;
                    }
                    Log.e("AvatarStickersRepository/fetchAvatarStickerPackAwait/unable to fetch sticker pack", A00);
                    C55862r2 r2 = r15.A02;
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("unhandled error (");
                    r2.A02(1, "fetch_avatar_sticker_pack_failed", C18260x0.A07(A00.getMessage(), A0o));
                    return null;
                }
            }
            C41742Lk r132 = (C41742Lk) r8.A06.get();
            r1 = (C51932kc) r8.A05.get();
            String A012 = r1.A01();
            if (num == null || num.intValue() != 7) {
                r14 = C371721f.INITIAL_DOWNLOAD;
            } else {
                r14 = C371721f.ART_UPDATE;
            }
            if (z) {
                z2 = true;
            }
            C18270x1.A12(set, r14);
            C67293Os B03 = r132.A01.B03(new AnonymousClass3SF(r132, r14, A012, set, z2));
            this.L$0 = number;
            this.L$1 = r8;
            this.L$2 = r1;
            this.L$3 = A012;
            this.label = 1;
            obj3 = C616131n.A00(this, AnonymousClass2C4.A01, new GraphqlRequest$postAwait$2(B03, (C84814Du) null));
            obj2 = A012;
            if (obj3 == r7) {
                return r7;
            }
        } else if (i == 1) {
            Object obj4 = this.L$3;
            r1 = (C51932kc) this.L$2;
            r8 = (C59762xR) this.L$1;
            number = (Number) this.L$0;
            C57682u2.A01(obj3);
            obj2 = obj4;
        } else {
            throw AnonymousClass001.A0d();
        }
        AnonymousClass2SI r10 = (AnonymousClass2SI) obj3;
        AnonymousClass28K A002 = AnonymousClass28L.A00(r10);
        if (A002 instanceof C29721kz) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("AvatarStickersRepository/fetchAvatarStickerPackAwait/");
            Object obj5 = ((C29721kz) A002).A00;
            C18260x0.A0n(obj5, A0o2);
            C55862r2 r72 = r8.A02;
            if (!(obj5 instanceof AnonymousClass28J) || (r12 = (AnonymousClass28J) obj5) == null || (str = C59762xR.A00(r12)) == null) {
                str = "no data";
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("Unable to identify error for GraphQL result, code: ");
                A0o3.append(r10.A00);
                A0o3.append(", raw: ");
                C18260x0.A0n(r10.A05, A0o3);
            }
            r72.A02(1, "fetch_avatar_sticker_pack_failed", str);
            return null;
        } else if (A002 instanceof AnonymousClass1l0) {
            C633538x r133 = (C633538x) ((AnonymousClass1l0) A002).A00;
            if (r133 == null) {
                return null;
            }
            List list = r133.A0A;
            if (obj2 == null) {
                C18270x1.A0j(C18270x1.A04(r1.A01), "pref_avatar_art_pending_revision", r133.A02);
            }
            if (list.isEmpty()) {
                Log.e("AvatarStickersRepository/fetchAvatarStickerPackAwait/received empty stickers list");
                r8.A02.A02(1, "fetch_avatar_sticker_pack_failed", "received empty stickers");
                return null;
            }
            if (number != null) {
                ((C55782qu) r8.A04.get()).A01(number.intValue(), "avatar_stickerpack_generated");
            }
            String str2 = r133.A05;
            String str3 = r133.A06;
            String str4 = r133.A03;
            String str5 = r133.A07;
            String str6 = r133.A09;
            String str7 = r133.A08;
            String str8 = str7;
            String str9 = str6;
            String str10 = str5;
            String str11 = str4;
            String str12 = str3;
            String str13 = str2;
            C633438w r16 = r133.A00;
            C50612iT A02 = ((AnonymousClass32Z) r8.A07.get()).A02(r16, str13, str12, str11, str10, str9, str8, r133.A04, list);
            if (number != null) {
                ((C55782qu) r8.A04.get()).A01(number.intValue(), "avatar_stickerpack_mapped");
            }
            return A02;
        } else {
            throw C73153f1.A00();
        }
    }

    public final C84814Du A0A(Object obj, C84814Du r9) {
        AvatarStickersRepository$fetchAvatarStickerPackAwait$2 avatarStickersRepository$fetchAvatarStickerPackAwait$2 = new AvatarStickersRepository$fetchAvatarStickerPackAwait$2(this.this$0, this.$qplInstanceKey, this.$stickerPackDownloadOrigin, this.$stableIds, r9, this.$defaultPack);
        avatarStickersRepository$fetchAvatarStickerPackAwait$2.L$0 = obj;
        return avatarStickersRepository$fetchAvatarStickerPackAwait$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
