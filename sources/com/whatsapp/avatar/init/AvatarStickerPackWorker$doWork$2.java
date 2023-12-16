package com.whatsapp.avatar.init;

import X.AnonymousClass4GR;
import X.C59022wD;
import X.C75003pT;
import X.C84814Du;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2", f = "AvatarStickerPackWorker.kt", i = {0, 0, 0, 0}, l = {56}, m = "invokeSuspend", n = {"$this$withContext", "origin", "originType", "cancelOngoingDownload"}, s = {"L$0", "L$1", "I$0", "Z$0"})
public final class AvatarStickerPackWorker$doWork$2 extends C75003pT implements AnonymousClass4GR {
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ AvatarStickerPackWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackWorker$doWork$2(AvatarStickerPackWorker avatarStickerPackWorker, C84814Du r3) {
        super(r3, 2);
        this.this$0 = avatarStickerPackWorker;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r0 == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A09(java.lang.Object r13) {
        /*
            r12 = this;
            X.218 r3 = X.AnonymousClass218.COROUTINE_SUSPENDED
            int r0 = r12.label
            r10 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0080
            if (r0 != r2) goto L_0x0115
            boolean r11 = r12.Z$0
            int r8 = r12.I$0
            java.lang.Object r6 = r12.L$1
            java.lang.String r6 = (java.lang.String) r6
            X.C57682u2.A01(r13)
        L_0x0015:
            boolean r0 = X.AnonymousClass001.A1Z(r13)
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "AvatarStickerPackWorker/triggered but user has no avatar, canceling retry loop."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.2r2 r3 = r0.A03
            java.lang.String r1 = "AvatarStickerPackWorker/failure"
            java.lang.String r0 = "abort_user_without_avatar"
            r3.A02(r2, r1, r0)
            X.0Ap r0 = new X.0Ap
            r0.<init>()
        L_0x0030:
            X.3dJ r2 = new X.3dJ
            r2.<init>()
            r0 = 7
            if (r8 == r0) goto L_0x005c
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.2op r4 = r0.A04
            r3 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "StickerPackDBTableHelper/getInstalledStickerPacks stickerPackId:"
            X.C18260x0.A0q(r0, r3, r1)
            java.lang.String r1 = "getInstalledStickerPacks/QUERY"
            java.lang.String r0 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)"
            java.util.List r1 = r4.A01(r0, r1, r3)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x006a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x006a
        L_0x0058:
            r0 = 1
        L_0x0059:
            r9 = 0
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r9 = 1
        L_0x005d:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.2dT r5 = r0.A01
            X.419 r7 = new X.419
            r7.<init>(r2)
            r5.A00(r6, r7, r8, r9, r10, r11)
            goto L_0x00d7
        L_0x006a:
            java.util.Iterator r1 = r1.iterator()
        L_0x006e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r1.next()
            X.2iT r0 = (X.C50612iT) r0
            boolean r0 = r0.A0S
            if (r0 == 0) goto L_0x006e
            r0 = 0
            goto L_0x0059
        L_0x0080:
            X.C57682u2.A01(r13)
            java.lang.Object r4 = r12.L$0
            java.lang.String r0 = "AvatarStickerPackWorker/doWork started"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.0Xq r1 = r0.A01
            java.lang.String r0 = "origin"
            java.lang.String r6 = r1.A03(r0)
            if (r6 != 0) goto L_0x009c
            java.lang.String r6 = "retry"
        L_0x009c:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.0Xq r5 = r0.A01
            java.lang.String r1 = "origin_type"
            r0 = 6
            int r8 = r5.A02(r1, r0)
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            androidx.work.WorkerParameters r0 = r0.A01
            X.0Xq r0 = r0.A01
            java.lang.String r1 = "cancel_ongoing"
            java.util.Map r0 = r0.A00
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x00d5
            boolean r11 = X.AnonymousClass001.A1Z(r1)
        L_0x00c0:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r0 = r12.this$0
            X.2gs r0 = r0.A02
            r12.L$0 = r4
            r12.L$1 = r6
            r12.I$0 = r8
            r12.Z$0 = r11
            r12.label = r2
            java.lang.Object r13 = r0.A00(r12, r2)
            if (r13 != r3) goto L_0x0015
            return r3
        L_0x00d5:
            r11 = 0
            goto L_0x00c0
        L_0x00d7:
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00de }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x00de }
            goto L_0x00e3
        L_0x00de:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x00e3:
            com.whatsapp.avatar.init.AvatarStickerPackWorker r1 = r12.this$0
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r2)
            if (r0 != 0) goto L_0x0110
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            X.C162457s7.A0H(r2)
            boolean r0 = r2.booleanValue()
            com.whatsapp.avatar.init.AvatarStickerPackWorker r1 = r12.this$0
            if (r0 == 0) goto L_0x010a
            X.2r2 r3 = r1.A03
            java.lang.String r2 = "AvatarStickerPackWorker/success"
            r1 = 0
            r0 = 1
            r3.A02(r0, r2, r1)
            X.0Ap r0 = new X.0Ap
            r0.<init>()
        L_0x0106:
            X.C162457s7.A0H(r0)
            return r0
        L_0x010a:
            r0 = 0
            X.0Is r0 = r1.A0F(r0)
            goto L_0x0106
        L_0x0110:
            X.0Is r0 = r1.A0F(r0)
            return r0
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avatar.init.AvatarStickerPackWorker$doWork$2.A09(java.lang.Object):java.lang.Object");
    }

    public final C84814Du A0A(Object obj, C84814Du r4) {
        AvatarStickerPackWorker$doWork$2 avatarStickerPackWorker$doWork$2 = new AvatarStickerPackWorker$doWork$2(this.this$0, r4);
        avatarStickerPackWorker$doWork$2.L$0 = obj;
        return avatarStickerPackWorker$doWork$2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return C59022wD.A00(obj2, obj, this);
    }
}
