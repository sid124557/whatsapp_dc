package X;

/* renamed from: X.2ib  reason: invalid class name and case insensitive filesystem */
public abstract class C50682ib {
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03af, code lost:
        if (r2 != X.C372821q.OWNER) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b8, code lost:
        X.AnonymousClass2A8.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04bb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C27871eo r13) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C27961ey
            if (r0 == 0) goto L_0x008e
            r3 = r12
            X.1ey r3 = (X.C27961ey) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.1VX r0 = r3.A02
            boolean r0 = X.C56952sp.A0F(r0)
            if (r0 == 0) goto L_0x0036
            X.7aq r2 = r13.A00
            java.lang.String r1 = "xwa2_notify_text_status_on_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl$Xwa2NotifyTextStatusOnUpdate> r0 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl.Xwa2NotifyTextStatusOnUpdate.class
            X.7aq r2 = r2.A00(r0, r1)
            X.C162457s7.A0D(r2)
            X.32Y r1 = com.whatsapp.jid.UserJid.Companion
            org.json.JSONObject r6 = r2.A00
            java.lang.String r0 = "jid"
            java.lang.String r0 = r6.optString(r0)
            com.whatsapp.jid.UserJid r7 = r1.A0E(r0)
            if (r7 != 0) goto L_0x0037
            java.lang.String r0 = "Null JID in TS updated notification"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0036:
            return
        L_0x0037:
            boolean r0 = X.C627336j.A0L(r7)
            if (r0 == 0) goto L_0x0045
            X.2sM r0 = r3.A01
            com.whatsapp.jid.PhoneUserJid r7 = X.C56662sM.A00(r0, r7)
            if (r7 == 0) goto L_0x0036
        L_0x0045:
            java.lang.String r5 = "ephemeral_duration_sec"
            int r1 = r6.optInt(r5)
            r0 = -1
            if (r1 != r0) goto L_0x0073
            r10 = -1
        L_0x0050:
            X.3Ex r6 = r3.A00
            java.lang.String r0 = "text"
            java.lang.String r8 = r2.A04(r0)
            java.lang.String r1 = "emoji"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl$Xwa2NotifyTextStatusOnUpdate$Emoji> r0 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl.Xwa2NotifyTextStatusOnUpdate.Emoji.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x006d
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "content"
            java.lang.String r9 = r1.optString(r0)
            if (r9 != 0) goto L_0x006f
        L_0x006d:
            java.lang.String r9 = ""
        L_0x006f:
            r6.A0Z(r7, r8, r9, r10)
            return
        L_0x0073:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r0 = "last_update_time"
            java.lang.String r0 = X.C18300x5.A0l(r0, r6)
            long r0 = java.lang.Long.parseLong(r0)
            long r10 = r4.toMillis(r0)
            int r0 = r6.optInt(r5)
            long r0 = (long) r0
            long r0 = r4.toMillis(r0)
            long r10 = r10 + r0
            goto L_0x0050
        L_0x008e:
            boolean r0 = r12 instanceof X.C27941ev
            if (r0 == 0) goto L_0x00dc
            r3 = r12
            X.1ev r3 = (X.C27941ev) r3
            r4 = 0
            X.C162457s7.A0J(r13, r4)
            X.1VX r0 = r3.A01
            boolean r0 = X.C56952sp.A0F(r0)
            if (r0 == 0) goto L_0x0036
            X.7aq r2 = r13.A00
            java.lang.String r1 = "xwa2_notify_text_status_on_update_side_sub"
            java.lang.Class<com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl$Xwa2NotifyTextStatusOnUpdateSideSub> r0 = com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationSideSubResponseImpl.Xwa2NotifyTextStatusOnUpdateSideSub.class
            X.7aq r0 = r2.A00(r0, r1)
            X.C162457s7.A0D(r0)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "hash"
            java.lang.String r1 = X.C18300x5.A0l(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0036
            byte[] r0 = X.AnonymousClass0x2.A1a(r1)
            byte[] r2 = android.util.Base64.decode(r0, r4)
            X.227 r0 = X.AnonymousClass227.A0J
            X.2zU r1 = new X.2zU
            r1.<init>(r0)
            r0 = 1
            r1.A02 = r0
            X.2xW r0 = X.C59812xW.A0P
            X.2zz r2 = X.C60982zU.A00(r1, r0, r2)
            X.3Cq r1 = r3.A00
            r0 = 1
            r1.A03(r2, r0)
            return
        L_0x00dc:
            boolean r0 = r12 instanceof X.AnonymousClass1ex
            if (r0 == 0) goto L_0x0131
            r9 = r12
            X.1ex r9 = (X.AnonymousClass1ex) r9
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r0 = "NewsletterNotificationStateChangeHandler/process state change notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7aq r8 = r13.A00
            java.lang.String r7 = "xwa2_notify_newsletter_on_state_change"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange> r6 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.class
            X.7aq r1 = r8.A00(r6, r7)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0036
            X.4uY r5 = X.C106415Yx.A00(r0)     // Catch:{ Exception -> 0x041d }
            X.2ss r0 = r9.A00     // Catch:{ Exception -> 0x041d }
            X.C106855aH.A02(r0, r5)     // Catch:{ Exception -> 0x041d }
            X.7aq r2 = r8.A00(r6, r7)     // Catch:{ Exception -> 0x041d }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange r2 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange) r2     // Catch:{ Exception -> 0x041d }
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State.class
            X.7aq r4 = r2.A00(r0, r1)     // Catch:{ Exception -> 0x041d }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange$State r4 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange.State) r4     // Catch:{ Exception -> 0x041d }
            if (r4 == 0) goto L_0x0036
            java.lang.String r3 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r2 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ Exception -> 0x041d }
            java.lang.Enum r0 = r4.A03(r2, r3)     // Catch:{ Exception -> 0x041d }
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType) r0     // Catch:{ Exception -> 0x041d }
            if (r0 == 0) goto L_0x040a
            int r1 = r0.ordinal()     // Catch:{ Exception -> 0x041d }
            r0 = 4
            if (r1 == r0) goto L_0x0404
            goto L_0x03d8
        L_0x0131:
            boolean r0 = r12 instanceof X.C27921et
            if (r0 == 0) goto L_0x0175
            r5 = r12
            X.1et r5 = (X.C27921et) r5
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            X.7aq r2 = r13.A00
            java.lang.String r1 = "xwa2_notify_newsletter_on_mute_change"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl$Xwa2NotifyNewsletterOnMuteChange> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterMuteChangeResponseImpl.Xwa2NotifyNewsletterOnMuteChange.class
            X.7aq r2 = r2.A00(r0, r1)
            if (r2 == 0) goto L_0x0036
            java.lang.String r0 = "id"
            java.lang.String r4 = r2.A04(r0)
            if (r4 == 0) goto L_0x0036
            java.lang.String r1 = "mute"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r3 = r2.A03(r0, r1)
            if (r3 == 0) goto L_0x0036
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterNotificationMuteHandler/success got results mute is "
            X.C18260x0.A1P(r1, r0, r3)
            X.2pl r2 = r5.A00
            X.4uY r1 = X.C106415Yx.A00(r4)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            boolean r0 = X.AnonymousClass000.A1Y(r3, r0)
            r2.A01(r1, r0)
            return
        L_0x0175:
            boolean r0 = r12 instanceof X.C27951ew
            if (r0 == 0) goto L_0x019a
            r7 = r12
            X.1ew r7 = (X.C27951ew) r7
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r0 = "NewsletterNotificationMetadataUpdateHandler/process set metadata notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7aq r6 = r13.A00
            java.lang.String r5 = "xwa2_notify_newsletter_on_metadata_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl$Xwa2NotifyNewsletterOnMetadataUpdate> r4 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate.class
            X.7aq r1 = r6.A00(r4, r5)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0036
            goto L_0x0428
        L_0x019a:
            boolean r0 = r12 instanceof X.C27911es
            if (r0 == 0) goto L_0x01f9
            r4 = r12
            X.1es r4 = (X.C27911es) r4
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r0 = "NewsletterNotificationLeaveHandler/process Leave notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7aq r2 = r13.A00
            java.lang.String r1 = "xwa2_notify_newsletter_on_leave"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl$Xwa2NotifyNewsletterOnLeave> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterLeaveResponseImpl.Xwa2NotifyNewsletterOnLeave.class
            X.7aq r1 = r2.A00(r0, r1)
            r3 = 0
            if (r1 == 0) goto L_0x0459
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x0459
            X.4uY r2 = X.C106415Yx.A00(r0)     // Catch:{ all -> 0x01c5 }
            goto L_0x01ca
        L_0x01c5:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x01ca:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r2)
            if (r0 == 0) goto L_0x01d7
            X.2pl r1 = r4.A00
            java.lang.String r0 = "Unable to parse JID for leave notification"
            r1.A02(r0)
        L_0x01d7:
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x01dc
            r3 = r2
        L_0x01dc:
            X.4uY r3 = (X.C95804uY) r3
            if (r3 == 0) goto L_0x0036
            X.2pl r2 = r4.A00
            java.lang.String r0 = "NewsletterNotificationHandler/process leave notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2ss r0 = r2.A02
            X.C106855aH.A02(r0, r3)
            X.2sL r1 = r2.A03
            X.21q r0 = X.C372821q.GUEST
            r1.A08(r0, r3)
            X.7qM r0 = r2.A08
            r0.A06(r3)
            return
        L_0x01f9:
            boolean r0 = r12 instanceof X.C27901er
            if (r0 == 0) goto L_0x0264
            r3 = r12
            X.1er r3 = (X.C27901er) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r0 = "NewsletterNotificationJoinHandler/process join notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7aq r7 = r13.A00
            java.lang.String r6 = "xwa2_notify_newsletter_on_join"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl$Xwa2NotifyNewsletterOnJoin> r5 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin.class
            X.7aq r1 = r7.A00(r5, r6)
            r4 = 0
            if (r1 == 0) goto L_0x045e
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x045e
            X.4uY r2 = X.C106415Yx.A00(r0)     // Catch:{ all -> 0x0224 }
            goto L_0x0229
        L_0x0224:
            r0 = move-exception
            X.3Z0 r2 = X.AnonymousClass3Z0.A01(r0)
        L_0x0229:
            java.lang.Throwable r0 = X.AnonymousClass3Z9.A00(r2)
            if (r0 == 0) goto L_0x0236
            X.2pl r1 = r3.A00
            java.lang.String r0 = "Unable to parse JID for join notification"
            r1.A02(r0)
        L_0x0236:
            boolean r0 = r2 instanceof X.AnonymousClass3Z0
            if (r0 != 0) goto L_0x023b
            r4 = r2
        L_0x023b:
            X.4uY r4 = (X.C95804uY) r4
            if (r4 == 0) goto L_0x0036
            X.2pl r3 = r3.A00
            X.7aq r0 = r7.A00(r5, r6)
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl$Xwa2NotifyNewsletterOnJoin r0 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterJoinResponseImpl.Xwa2NotifyNewsletterOnJoin) r0
            X.C162457s7.A0D(r0)
            X.3Q4 r2 = new X.3Q4
            r2.<init>(r0)
            java.lang.String r0 = "NewsletterNotificationHandler/process join notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7r8 r1 = r3.A0A
            r0 = 0
            X.1RL r1 = r1.A0A(r2, r4, r0)
            X.2rc r0 = r3.A09
            r0.A01(r4)
            r3.A00(r1)
            return
        L_0x0264:
            boolean r0 = r12 instanceof X.C27891eq
            if (r0 == 0) goto L_0x030e
            r3 = r12
            X.1eq r3 = (X.C27891eq) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r0 = "NewsletterNotificationAdminPromoteHandler/process admin promote notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7aq r10 = r13.A00
            java.lang.String r9 = "xwa2_notify_newsletter_admin_promote"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote> r8 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.class
            X.7aq r0 = r10.A00(r8, r9)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C18300x5.A0l(r0, r1)
            X.4uY r5 = X.C106415Yx.A00(r0)     // Catch:{ all -> 0x028c }
            goto L_0x0291
        L_0x028c:
            r0 = move-exception
            X.3Z0 r5 = X.AnonymousClass3Z0.A01(r0)
        L_0x0291:
            boolean r0 = r5 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x0296
            r5 = 0
        L_0x0296:
            X.4uY r5 = (X.C95804uY) r5
            if (r5 == 0) goto L_0x0036
            X.32X r7 = com.whatsapp.jid.PhoneUserJid.Companion
            X.7aq r2 = r10.A00(r8, r9)
            r6 = 0
            if (r2 == 0) goto L_0x030c
            java.lang.String r1 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$User> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.User.class
            X.7aq r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x030c
            java.lang.String r0 = "pn"
            java.lang.String r0 = r1.A04(r0)
        L_0x02b5:
            com.whatsapp.jid.PhoneUserJid r4 = r7.A02(r0)
            X.7aq r2 = r10.A00(r8, r9)
            if (r2 == 0) goto L_0x02d0
            java.lang.String r1 = "admin"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$Admin> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.Admin.class
            X.7aq r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x02d0
            java.lang.String r0 = "pn"
            java.lang.String r6 = r1.A04(r0)
        L_0x02d0:
            com.whatsapp.jid.PhoneUserJid r8 = r7.A02(r6)
            if (r4 == 0) goto L_0x0036
            if (r8 == 0) goto L_0x0036
            X.2pl r3 = r3.A00
            java.lang.String r0 = "NewsletterActionHandlers/process admin promote notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sr r7 = r3.A01
            boolean r0 = r7.A0a(r4)
            if (r0 == 0) goto L_0x04bc
            X.2sL r1 = r3.A03
            X.21q r0 = X.C372821q.ADMIN
            r1.A08(r0, r5)
            X.2Zu r6 = r3.A07
            X.2g2 r9 = r6.A01
            r2 = 0
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()
            java.lang.String[] r11 = X.AnonymousClass0x9.A1Y()
            X.34p r0 = r9.A01
            long r0 = r0.A05(r5)
            X.AnonymousClass0x2.A1S(r11, r2, r0)
            X.3dV r0 = r9.A02
            X.4GK r9 = r0.get()
            goto L_0x0466
        L_0x030c:
            r0 = r6
            goto L_0x02b5
        L_0x030e:
            boolean r0 = r12 instanceof X.C27881ep
            if (r0 == 0) goto L_0x04dd
            r3 = r12
            X.1ep r3 = (X.C27881ep) r3
            r0 = 0
            X.C162457s7.A0J(r13, r0)
            java.lang.String r0 = "NewsletterNotificationAdminDemoteHandler/process admin dismiss notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.7aq r10 = r13.A00
            java.lang.String r9 = "xwa2_notify_newsletter_admin_demote"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote> r8 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.class
            X.7aq r0 = r10.A00(r8, r9)
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C18300x5.A0l(r0, r1)
            X.4uY r5 = X.C106415Yx.A00(r0)     // Catch:{ all -> 0x0336 }
            goto L_0x033b
        L_0x0336:
            r0 = move-exception
            X.3Z0 r5 = X.AnonymousClass3Z0.A01(r0)
        L_0x033b:
            boolean r0 = r5 instanceof X.AnonymousClass3Z0
            if (r0 == 0) goto L_0x0340
            r5 = 0
        L_0x0340:
            X.4uY r5 = (X.C95804uY) r5
            if (r5 == 0) goto L_0x0036
            X.32W r7 = com.whatsapp.jid.Jid.Companion
            X.7aq r2 = r10.A00(r8, r9)
            r6 = 0
            if (r2 == 0) goto L_0x03d6
            java.lang.String r1 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$User> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.User.class
            X.7aq r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x03d6
            java.lang.String r0 = "pn"
            java.lang.String r0 = r1.A04(r0)
        L_0x035f:
            com.whatsapp.jid.Jid r4 = r7.A03(r0)
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4
            X.7aq r2 = r10.A00(r8, r9)
            if (r2 == 0) goto L_0x037c
            java.lang.String r1 = "admin"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$Admin> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.Admin.class
            X.7aq r1 = r2.A00(r0, r1)
            if (r1 == 0) goto L_0x037c
            java.lang.String r0 = "pn"
            java.lang.String r6 = r1.A04(r0)
        L_0x037c:
            com.whatsapp.jid.Jid r7 = r7.A03(r6)
            X.4uZ r7 = (X.C95814uZ) r7
            if (r4 == 0) goto L_0x0036
            if (r7 == 0) goto L_0x0036
            X.2pl r3 = r3.A00
            java.lang.String r0 = "NewsletterActionHandlers/process admin dismiss notification"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2sr r6 = r3.A01
            boolean r0 = r6.A0a(r4)
            if (r0 == 0) goto L_0x039c
            X.2sL r1 = r3.A03
            X.21q r0 = X.C372821q.SUBSCRIBED
            r1.A08(r0, r5)
        L_0x039c:
            X.2ss r0 = r3.A02
            X.31A r1 = X.C56982ss.A00(r0, r5)
            boolean r0 = r1 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x03b1
            X.1RL r1 = (X.AnonymousClass1RL) r1
            if (r1 == 0) goto L_0x03b1
            X.21q r2 = r1.A07
            X.21q r0 = X.C372821q.OWNER
            r1 = 1
            if (r2 == r0) goto L_0x03b2
        L_0x03b1:
            r1 = 0
        L_0x03b2:
            boolean r0 = r6.A0a(r7)
            if (r0 != 0) goto L_0x03c7
            if (r1 != 0) goto L_0x03c0
            boolean r0 = r6.A0a(r4)
            if (r0 == 0) goto L_0x03c7
        L_0x03c0:
            X.2cx r1 = r3.A06
            X.20b r0 = X.C368720b.DEMOTE
            r1.A00(r5, r4, r0)
        L_0x03c7:
            X.1iP r3 = r3.A05
            X.3Wh r2 = r3.A00
            r1 = 15
            X.3aM r0 = new X.3aM
            r0.<init>(r3, r5, r4, r1)
            X.C69253Wh.A01(r2, r0)
            return
        L_0x03d6:
            r0 = r6
            goto L_0x035f
        L_0x03d8:
            r0 = 1
            if (r1 == r0) goto L_0x03e2
            r0 = 2
            if (r1 == r0) goto L_0x03e2
            r0 = 3
            if (r1 == r0) goto L_0x03e2
            goto L_0x040a
        L_0x03e2:
            X.2pl r2 = r9.A01     // Catch:{ Exception -> 0x041d }
            X.7aq r0 = r8.A00(r6, r7)     // Catch:{ Exception -> 0x041d }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl$Xwa2NotifyNewsletterOnStateChange r0 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterStateChangeResponseImpl.Xwa2NotifyNewsletterOnStateChange) r0     // Catch:{ Exception -> 0x041d }
            X.C162457s7.A0D(r0)     // Catch:{ Exception -> 0x041d }
            X.3Q6 r1 = new X.3Q6     // Catch:{ Exception -> 0x041d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x041d }
            X.7r8 r0 = r2.A0A     // Catch:{ Exception -> 0x041d }
            X.1RL r0 = r0.A09(r1, r5)     // Catch:{ Exception -> 0x041d }
            if (r0 != 0) goto L_0x0400
            java.lang.String r0 = "Failed to convert newsletter suspend into NewsletterInfo"
            r2.A02(r0)     // Catch:{ Exception -> 0x041d }
            return
        L_0x0400:
            r2.A00(r0)     // Catch:{ Exception -> 0x041d }
            return
        L_0x0404:
            X.2se r0 = r9.A02     // Catch:{ Exception -> 0x041d }
            r0.A07(r5)     // Catch:{ Exception -> 0x041d }
            return
        L_0x040a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x041d }
            java.lang.String r0 = "NewsletterNotificationStateChangeHandler/handle state should skip "
            r1.append(r0)     // Catch:{ Exception -> 0x041d }
            java.lang.Enum r0 = r4.A03(r2, r3)     // Catch:{ Exception -> 0x041d }
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType) r0     // Catch:{ Exception -> 0x041d }
            X.C18260x0.A0m(r0, r1)     // Catch:{ Exception -> 0x041d }
            return
        L_0x041d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "NewsletterNotificationStateChangeHandler/error "
            X.C18260x0.A1Q(r1, r0, r2)
            return
        L_0x0428:
            X.4uY r3 = X.C106415Yx.A00(r0)     // Catch:{ Exception -> 0x0453 }
            X.2ss r0 = r7.A00     // Catch:{ Exception -> 0x0453 }
            X.C106855aH.A02(r0, r3)     // Catch:{ Exception -> 0x0453 }
            X.7r8 r2 = r7.A02     // Catch:{ Exception -> 0x0453 }
            X.7aq r1 = r6.A00(r4, r5)     // Catch:{ Exception -> 0x0453 }
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl$Xwa2NotifyNewsletterOnMetadataUpdate r1 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterUpdateResponseImpl.Xwa2NotifyNewsletterOnMetadataUpdate) r1     // Catch:{ Exception -> 0x0453 }
            X.C162457s7.A0D(r1)     // Catch:{ Exception -> 0x0453 }
            X.3Q5 r0 = new X.3Q5     // Catch:{ Exception -> 0x0453 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0453 }
            X.1RL r1 = r2.A09(r0, r3)     // Catch:{ Exception -> 0x0453 }
            if (r1 == 0) goto L_0x044d
            X.2pl r0 = r7.A01     // Catch:{ Exception -> 0x0453 }
            r0.A00(r1)     // Catch:{ Exception -> 0x0453 }
            return
        L_0x044d:
            java.lang.String r0 = "NewsletterNotificationMetadataUpdateHandler/failed to find newsletterInfo"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x0453 }
            return
        L_0x0453:
            java.lang.String r0 = "NewsletterNotificationMetadataUpdateHandler/failed to get newsletterInfo"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0459:
            X.2pl r1 = r4.A00
            java.lang.String r0 = "Received leave notification with null JID"
            goto L_0x0462
        L_0x045e:
            X.2pl r1 = r3.A00
            java.lang.String r0 = "Received join notification with null JID"
        L_0x0462:
            r1.A02(r0)
            return
        L_0x0466:
            r0 = r9
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x04b5 }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x04b5 }
            java.lang.String r1 = "SELECT message_row_id FROM message_newsletter_admin_invite WHERE newsletter_jid_row_id = ? AND expiration != 0 "
            java.lang.String r0 = "GET_NEWSLETTER_ADMIN_INVITE_MESSAGES_BY_NEWSLETTER_SQL"
            android.database.Cursor r2 = r2.A0E(r1, r0, r11)     // Catch:{ all -> 0x04b5 }
        L_0x0473:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x0484
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04ae }
            X.C18260x0.A0H(r2, r10, r0)     // Catch:{ all -> 0x04ae }
            goto L_0x0473
        L_0x0484:
            r2.close()     // Catch:{ all -> 0x04b5 }
            r9.close()
            java.util.Iterator r9 = r10.iterator()
        L_0x048e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04bc
            long r0 = X.C18270x1.A02(r9)
            X.2qz r2 = r6.A02
            X.34x r2 = X.C55122pp.A00(r2, r0)
            X.1mM r2 = (X.C30381mM) r2
            if (r2 == 0) goto L_0x048e
            r0 = 0
            r2.A00 = r0
            X.3Lv r1 = r6.A00
            r0 = 21
            r1.A0b(r2, r0)
            goto L_0x048e
        L_0x04ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04b0 }
        L_0x04b0:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)     // Catch:{ all -> 0x04b5 }
            throw r0     // Catch:{ all -> 0x04b5 }
        L_0x04b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04b7 }
        L_0x04b7:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r9, r1)
            throw r0
        L_0x04bc:
            boolean r0 = r7.A0a(r8)
            if (r0 == 0) goto L_0x04ce
            X.2Zu r0 = r3.A07
            r0.A00(r5, r4)
            X.2cx r1 = r3.A06
            X.20b r0 = X.C368720b.PROMOTE
            r1.A00(r5, r4, r0)
        L_0x04ce:
            X.1iP r3 = r3.A05
            X.3Wh r2 = r3.A00
            r1 = 15
            X.3aM r0 = new X.3aM
            r0.<init>(r3, r5, r4, r1)
            X.C69253Wh.A01(r2, r0)
            return
        L_0x04dd:
            java.lang.StringBuilder r3 = X.C18270x1.A0X(r13)
            java.lang.String r0 = "handleNotification work with direct result "
            r3.append(r0)
            X.7aq r2 = r13.A00
            java.lang.String r1 = "xwa2_newsletter"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl$Xwa2Newsletter> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataResponseImpl.Xwa2Newsletter.class
            X.7aq r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0504
            org.json.JSONObject r0 = r0.A00
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl r1 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFieldsImpl
            r1.<init>(r0)
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
        L_0x0500:
            X.C18260x0.A1J(r3, r0)
            return
        L_0x0504:
            r0 = 0
            goto L_0x0500
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50682ib.A00(X.1eo):void");
    }
}
