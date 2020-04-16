package org.example.controller;

import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;



public class BotCounterUpdate {
    static Integer count = 0;
    public static void runUpdateCounter(Update update) {
        BotCounter bot = new BotCounter();
        Message message = update.getMessage();

        if(message.hasAnimation() || message.hasAudio() || message.hasContact() || message.hasDice() || message.hasDocument() ||
                message.hasEntities() || message.hasInvoice() || message.hasLocation() || message.hasPassportData() ||
                message.hasPhoto() || message.hasPoll() || message.hasReplyMarkup() || message.hasSticker() ||
                message.hasSuccessfulPayment() || message.hasText() || message.hasVideo() || message.hasVideoNote() ||
                message.hasVoice()){
            count++;
            if (message.getText().contains("!total")){
                bot.sendMsg(message, "Всего сообщений: " + count);
            }
        }
    }
}
