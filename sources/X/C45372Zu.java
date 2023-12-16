package X;

/* renamed from: X.2Zu  reason: invalid class name and case insensitive filesystem */
public final class C45372Zu {
    public final C66543Lv A00;
    public final C49132g2 A01;
    public final C55832qz A02;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        X.AnonymousClass2A8.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C95804uY r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            X.2g2 r5 = r6.A01
            r4 = 0
            r2 = 1
            java.lang.String[] r3 = X.AnonymousClass0x9.A1Z()
            X.34p r0 = r5.A01
            long r0 = r0.A05(r7)
            X.AnonymousClass0x2.A1S(r3, r4, r0)
            X.2sm r0 = r5.A00
            X.C56922sm.A02(r0, r8, r3, r2)
            X.3dV r0 = r5.A02
            X.4GK r5 = r0.get()
            r0 = r5
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0066 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "\n        SELECT invite.message_row_id AS message_row_id \n        FROM message_newsletter_admin_invite invite\n        JOIN available_message_view message  \n        WHERE \n          invite.message_row_id = message._id AND\n          invite.newsletter_jid_row_id = ? AND \n          message.chat_row_id = ? AND \n          message.message_type = 94 AND\n          invite.expiration != 0 \n        ORDER BY message.sort_id DESC\n        "
            java.lang.String r0 = "GET_LAST_SENT_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_NEWSLETTER_AND_INVITEE_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x0066 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "message_row_id"
            long r3 = X.AnonymousClass0x2.A0C(r2, r0)     // Catch:{ all -> 0x005f }
            r2.close()     // Catch:{ all -> 0x0066 }
            r5.close()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            X.2qz r0 = r6.A02
            X.34x r2 = X.C55122pp.A00(r0, r3)
            X.1mM r2 = (X.C30381mM) r2
            if (r2 == 0) goto L_0x005e
            r0 = 0
            r2.A00 = r0
            X.3Lv r1 = r6.A00
            r0 = 21
            r1.A0b(r2, r0)
            return
        L_0x0058:
            r2.close()     // Catch:{ all -> 0x0066 }
            r5.close()
        L_0x005e:
            return
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45372Zu.A00(X.4uY, com.whatsapp.jid.UserJid):void");
    }

    public C45372Zu(C66543Lv r1, C49132g2 r2, C55832qz r3) {
        C18260x0.A0V(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
