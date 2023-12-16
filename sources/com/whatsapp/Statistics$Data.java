package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x9;
import X.C18310x6;
import org.json.JSONObject;

public class Statistics$Data {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public final long A0O;

    public Statistics$Data(JSONObject jSONObject) {
        C18310x6.A1C(this);
        this.A0A = jSONObject.getLong("rx_text_msgs");
        this.A0L = jSONObject.getLong("tx_text_msgs");
        this.A02 = jSONObject.getLong("rx_media_msgs");
        this.A0F = jSONObject.getLong("tx_media_msgs");
        this.A06 = jSONObject.getLong("rx_payment_msgs");
        this.A0H = jSONObject.getLong("tx_payment_msgs");
        this.A09 = jSONObject.getLong("rx_statuses");
        this.A0K = jSONObject.getLong("tx_statuses");
        this.A05 = jSONObject.getLong("rx_offline_msgs");
        this.A04 = jSONObject.getLong("rx_offline_delay");
        this.A01 = jSONObject.getLong("rx_media_bytes");
        this.A0E = jSONObject.getLong("tx_media_bytes");
        this.A03 = jSONObject.getLong("rx_message_service_bytes");
        this.A0G = jSONObject.getLong("tx_message_service_bytes");
        this.A08 = jSONObject.getLong("rx_status_bytes");
        this.A0J = jSONObject.getLong("tx_status_bytes");
        this.A0O = jSONObject.getLong("last_reset");
        this.A0C = jSONObject.getLong("rx_voip_calls");
        this.A0N = jSONObject.getLong("tx_voip_calls");
        this.A0B = jSONObject.getLong("rx_voip_bytes");
        this.A0M = jSONObject.getLong("tx_voip_bytes");
        this.A00 = jSONObject.getLong("rx_google_drive_bytes");
        this.A0D = jSONObject.getLong("tx_google_drive_bytes");
        this.A07 = jSONObject.getLong("rx_roaming_bytes");
        this.A0I = jSONObject.getLong("tx_roaming_bytes");
    }

    public String A00() {
        JSONObject A1G = AnonymousClass0x9.A1G();
        A1G.put("rx_text_msgs", this.A0A);
        A1G.put("tx_text_msgs", this.A0L);
        A1G.put("rx_media_msgs", this.A02);
        A1G.put("tx_media_msgs", this.A0F);
        A1G.put("rx_payment_msgs", this.A06);
        A1G.put("tx_payment_msgs", this.A0H);
        A1G.put("rx_statuses", this.A09);
        A1G.put("tx_statuses", this.A0K);
        A1G.put("rx_offline_msgs", this.A05);
        A1G.put("rx_offline_delay", this.A04);
        A1G.put("rx_media_bytes", this.A01);
        A1G.put("tx_media_bytes", this.A0E);
        A1G.put("rx_message_service_bytes", this.A03);
        A1G.put("tx_message_service_bytes", this.A0G);
        A1G.put("rx_status_bytes", this.A08);
        A1G.put("tx_status_bytes", this.A0J);
        A1G.put("last_reset", this.A0O);
        A1G.put("rx_voip_calls", this.A0C);
        A1G.put("tx_voip_calls", this.A0N);
        A1G.put("rx_voip_bytes", this.A0B);
        A1G.put("tx_voip_bytes", this.A0M);
        A1G.put("rx_google_drive_bytes", this.A00);
        A1G.put("tx_google_drive_bytes", this.A0D);
        A1G.put("rx_roaming_bytes", this.A07);
        A1G.put("tx_roaming_bytes", this.A0I);
        return A1G.toString();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Text Messages: ");
        A0o.append(this.A0L);
        A0o.append(" sent, ");
        A0o.append(this.A0A);
        A0o.append(" received / Media Messages: ");
        A0o.append(this.A0F);
        A0o.append(" sent (");
        long j = this.A0E;
        A0o.append(j);
        A0o.append(" bytes), ");
        A0o.append(this.A02);
        A0o.append(" received (");
        long j2 = this.A01;
        A0o.append(j2);
        A0o.append(" bytes) / Offline Messages: ");
        A0o.append(this.A05);
        A0o.append(" received (");
        A0o.append(this.A04);
        A0o.append(" msec average delay) / Status : ");
        A0o.append(this.A0K);
        A0o.append(" sent (");
        long j3 = this.A0J;
        long j4 = j3;
        A0o.append(j3);
        A0o.append(" bytes), ");
        A0o.append(this.A09);
        A0o.append(" received (");
        long j5 = this.A08;
        long j6 = j5;
        A0o.append(j5);
        A0o.append(" bytes) / Payment Messages : ");
        A0o.append(this.A0H);
        A0o.append(" sent, ");
        A0o.append(this.A06);
        A0o.append(" received / Message Service: ");
        long j7 = this.A0G;
        long j8 = j7;
        A0o.append(j7);
        A0o.append(" bytes sent, ");
        long j9 = this.A03;
        A0o.append(j9);
        A0o.append(" bytes received / Voip Calls: ");
        A0o.append(this.A0N);
        A0o.append(" outgoing calls, ");
        A0o.append(this.A0C);
        A0o.append(" incoming calls, ");
        long j10 = this.A0M;
        A0o.append(j10);
        A0o.append(" bytes sent, ");
        long j11 = this.A0B;
        A0o.append(j11);
        A0o.append(" bytes received / Google Drive: ");
        long j12 = this.A0D;
        A0o.append(j12);
        A0o.append(" bytes sent, ");
        long j13 = this.A00;
        A0o.append(j13);
        A0o.append(" bytes received / Roaming: ");
        A0o.append(this.A0I);
        A0o.append(" bytes sent, ");
        A0o.append(this.A07);
        A0o.append(" bytes received / Total Data: ");
        A0o.append(j + j8 + j10 + j12 + j4);
        A0o.append(" bytes sent, ");
        A0o.append(j2 + j9 + j11 + j13 + j6);
        return AnonymousClass000.A0X(" bytes received", A0o);
    }

    public Statistics$Data(boolean z) {
        long j;
        C18310x6.A1C(this);
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = Long.MIN_VALUE;
        }
        this.A0O = j;
    }
}
