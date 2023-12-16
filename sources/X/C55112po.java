package X;

import java.util.List;

/* renamed from: X.2po  reason: invalid class name and case insensitive filesystem */
public class C55112po {
    public String A00;
    public final C55682qk A01;
    public final AnonymousClass4FV A02;
    public final C44442Wb A03;
    public final C56022rI A04;
    public final C55362qE A05;
    public final C56502s5 A06;
    public final AnonymousClass33M A07;
    public final AnonymousClass4FS A08;
    public final C183538qC A09;
    public final C183538qC A0A;
    public final C183538qC A0B;
    public final List A0C = AnonymousClass001.A0s();

    public void A02(int i, long j, int i2) {
        this.A08.BkM(new C70453aW(this, i, i2, 1, j));
    }

    public final C25991bP A00(int i) {
        long A072;
        long A012;
        C56022rI r0 = this.A04;
        String A022 = r0.A02();
        C183538qC r4 = r0.A02;
        String string = C18300x5.A0B(r4).getString("/export/logging/attemptId", (String) null);
        if (string == null) {
            string = C18280x3.A0Y();
            C18270x1.A0j(AnonymousClass0x2.A0E(r4), "/export/logging/attemptId", string);
        }
        C25991bP r3 = new C25991bP();
        r3.A09 = Integer.valueOf(i);
        r3.A0Q = A022;
        r3.A0L = string;
        r3.A04 = Integer.valueOf(C18300x5.A0B(r4).getBoolean("/export/isDonor", false) ^ true ? 1 : 0);
        r3.A06 = Integer.valueOf(C18300x5.A0B(r4).getBoolean("/export/startedOnReceiver", false) ? 1 : 0);
        r3.A0J = AnonymousClass0x9.A0m(C18300x5.A0B(r4).getInt("/export/protocolVersion", 2));
        synchronized (this) {
            A072 = this.A07.A07();
        }
        r3.A0B = Long.valueOf(C18290x4.A0B(A072));
        if (i == 4 || i == 11 || i == 13 || i == 15) {
            C59412ws r1 = (C59412ws) this.A0A.get();
            if (i == 11) {
                r3.A00 = C18330xA.A07(r1.A01(this.A05.A00()));
            } else if (i == 15) {
                C44442Wb r2 = this.A03;
                r3.A0F = AnonymousClass0x9.A0m(C44442Wb.A00(r2, "import/msg/success"));
                r3.A0E = AnonymousClass0x9.A0m(C44442Wb.A00(r2, "import/msg/failed"));
                r3.A0D = AnonymousClass0x9.A0m(C44442Wb.A00(r2, "import/msg/file/success"));
                r3.A0C = AnonymousClass0x9.A0m(C44442Wb.A00(r2, "import/msg/file/failed"));
            }
            Long A002 = ((AnonymousClass2W1) this.A09.get()).A00();
            long A003 = C61072zf.A00(this.A0B);
            if (A002 != null) {
                r3.A02 = C18330xA.A07(r1.A01(A002.longValue()));
            }
            A012 = r1.A01(A003);
        } else {
            if (i == 0) {
                A012 = ((C59412ws) this.A0A.get()).A01(C61072zf.A00(this.A0B));
            }
            return r3;
        }
        r3.A0K = Long.valueOf(A012);
        return r3;
    }

    public void A01(int i) {
        this.A08.BkM(new C117705sM((Object) this, i, 46));
    }

    public C55112po(C55682qk r2, AnonymousClass4FV r3, C44442Wb r4, C56022rI r5, C55362qE r6, C56502s5 r7, AnonymousClass4FS r8, C183538qC r9, C183538qC r10, C183538qC r11) {
        this.A01 = r2;
        this.A08 = r8;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A0B = r9;
        this.A05 = r6;
        this.A04 = r5;
        this.A0A = r10;
        this.A09 = r11;
        AnonymousClass33M A012 = AnonymousClass33M.A01("fpm/LoggingManager/duration");
        this.A07 = A012;
        A012.A07();
    }

    public final void A03(C25991bP r10) {
        Integer num;
        String str;
        String str2;
        String str3;
        Integer num2;
        if (!C18290x4.A0Z().equals(r10.A04) || (num2 = r10.A09) == null || num2.intValue() < 5) {
            this.A02.BhD(r10);
        } else {
            C18260x0.A1R(AnonymousClass001.A0o(), "fpm/LoggingManager/event saved to be transferred and logged from receiver, value: ", r10);
            this.A0C.add(r10);
        }
        Integer num3 = r10.A04;
        if (num3 != null && num3.intValue() == 0 && (num = r10.A09) != null && (str = r10.A0Q) != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("chat-transfer-");
            int intValue = num.intValue();
            switch (intValue) {
                case 0:
                    str2 = "canceled";
                    break;
                case 1:
                    str2 = "failed";
                    break;
                case 2:
                    str2 = "attempt_to_open_landing_screen";
                    break;
                case 3:
                    str2 = "open_landing_screen";
                    break;
                case 4:
                    str2 = "started";
                    break;
                case 5:
                    str2 = "open_qr_code_screen";
                    break;
                case 6:
                    str2 = "qr_code_generated";
                    break;
                case 7:
                    str2 = "qr_code_scanned";
                    break;
                case 8:
                    str2 = "new_device_found";
                    break;
                case 9:
                    str2 = "connected_to_peer";
                    break;
                case 10:
                    str2 = "export_started";
                    break;
                case 11:
                    str2 = "export_completed";
                    break;
                case 12:
                    str2 = "transfer_started";
                    break;
                case 13:
                    str2 = "transfer_completed";
                    break;
                case 14:
                    str2 = "import_started";
                    break;
                case 15:
                    str2 = "import_completed";
                    break;
                case 16:
                    str2 = "searching_for_peer";
                    break;
                default:
                    throw AnonymousClass000.A0G("Unknown enum value: ", AnonymousClass001.A0o(), intValue);
            }
            String A0X = AnonymousClass000.A0X(str2, A0o);
            Integer num4 = r10.A07;
            if (num4 != null) {
                int intValue2 = num4.intValue();
                switch (intValue2) {
                    case 0:
                        str3 = "feature_unavailable";
                        break;
                    case 1:
                        str3 = "failed_to_set_server_flag";
                        break;
                    case 2:
                        str3 = "failed_to_generate_qr_code";
                        break;
                    case 3:
                        str3 = "failed_to_parse_qr_code";
                        break;
                    case 4:
                        str3 = "phone_number_mismatch";
                        break;
                    case 5:
                        str3 = "failed_to_connect";
                        break;
                    case 6:
                        str3 = "cannot_access_chat_storage";
                        break;
                    case 7:
                        str3 = "cannot_create_migration_directory";
                        break;
                    case 8:
                        str3 = "cannot_write_metadata";
                        break;
                    case 9:
                        str3 = "cannot_write_protobuf";
                        break;
                    case 10:
                        str3 = "insufficient_disk_space";
                        break;
                    case 11:
                        str3 = "cannot_fetch_key";
                        break;
                    case 12:
                        str3 = "invalid_key_type";
                        break;
                    case 13:
                        str3 = "cannot_create_encryption_zip";
                        break;
                    case 14:
                        str3 = "failed_aesgcm_encryption";
                        break;
                    case 15:
                        str3 = "lost_connection";
                        break;
                    case 16:
                        str3 = "improper_message_received";
                        break;
                    case 17:
                        str3 = "cannot_retrieve_key_data";
                        break;
                    case 18:
                        str3 = "unexpected_schema";
                        break;
                    case 19:
                        str3 = "encryption_zip_not_found";
                        break;
                    case 20:
                        str3 = "failed_aesgcm_decryption";
                        break;
                    case 21:
                        str3 = "failed_file_management";
                        break;
                    case 22:
                        str3 = "messages_zip_not_found";
                        break;
                    case 23:
                        str3 = "failed_unzip_message_import";
                        break;
                    case 24:
                        str3 = "unknown";
                        break;
                    case 25:
                        str3 = "authentication_error";
                        break;
                    case 26:
                        str3 = "unable_to_start_server";
                        break;
                    case 27:
                        str3 = "wifi_direct_error";
                        break;
                    default:
                        throw AnonymousClass000.A0G("Unknown enum value: ", AnonymousClass001.A0o(), intValue2);
                }
            } else {
                Integer num5 = r10.A03;
                if (num5 != null) {
                    int intValue3 = num5.intValue();
                    switch (intValue3) {
                        case 0:
                            str3 = "cancel_on_landing_screen";
                            break;
                        case 1:
                            str3 = "cancel_on_qr_code_scan_screen";
                            break;
                        case 2:
                            str3 = "cancel_on_qr_code_display_screen";
                            break;
                        case 3:
                            str3 = "cancel_during_pairing";
                            break;
                        case 4:
                            str3 = "cancel_during_export";
                            break;
                        case 5:
                            str3 = "cancel_during_transfer";
                            break;
                        case 6:
                            str3 = "cancel_during_import";
                            break;
                        case 7:
                            str3 = "permissions_needed_not_granted";
                            break;
                        case 8:
                            str3 = "wifi_off";
                            break;
                        case 9:
                            str3 = "location_off";
                            break;
                        case 10:
                            str3 = "local_network_not_granted";
                            break;
                        case 11:
                            str3 = "network_not_connected";
                            break;
                        case 12:
                            str3 = "cancellation_on_other_device";
                            break;
                        default:
                            throw AnonymousClass000.A0G("Unknown enum value: ", AnonymousClass001.A0o(), intValue3);
                    }
                } else {
                    str3 = null;
                }
            }
            String str4 = r10.A0P;
            if (str4 == null) {
                str4 = null;
            }
            C56502s5 r3 = this.A06;
            String str5 = r10.A0L;
            Integer num6 = r10.A06;
            if (r3.A08()) {
                C48232eZ r4 = new C48232eZ();
                r4.A01("event_name", A0X);
                r4.A01("funnel_id", str);
                if (str5 != null) {
                    r4.A01("ios_attempt_id", str5);
                }
                if (str3 != null) {
                    r4.A01("client_error_type", str3);
                }
                if (str4 != null) {
                    r4.A01("client_error_context", str4);
                }
                if (num6 != null) {
                    int intValue4 = num6.intValue();
                    r4.A00("fpm_entry_point", intValue4);
                    r4.A00("google_migrate_import_error", intValue4);
                }
                C18260x0.A0s("FunnelLogger/event-name: ", A0X, AnonymousClass001.A0o());
                ((AnonymousClass4FS) r3.A05.get()).BkM(new C70143a1(r3, 18, r4));
            }
        }
    }
}
