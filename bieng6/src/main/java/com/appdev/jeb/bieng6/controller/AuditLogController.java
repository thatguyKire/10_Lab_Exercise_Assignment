package com.appdev.jeb.bieng6.controller;

import com.appdev.jeb.bieng6.entity.AuditLog;
import com.appdev.jeb.bieng6.service.AuditLogService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/auditlogs")
@CrossOrigin
public class AuditLogController {
    private final AuditLogService auditLogService;

    public AuditLogController(AuditLogService auditLogService) {
        this.auditLogService = auditLogService;
    }

    @GetMapping
    public List<AuditLog> getAllLogs() {
        return auditLogService.getAllLogs();
    }

    @GetMapping("/{id}")
    public AuditLog getLogById(@PathVariable Long id) {
        return auditLogService.getLogById(id).orElse(null);
    }

    @PostMapping
    public AuditLog createLog(@RequestBody AuditLog log) {
        return auditLogService.saveLog(log);
    }

    @PutMapping("/{id}")
    public AuditLog updateLog(@PathVariable Long id, @RequestBody AuditLog log) {
        log.setLogId(id);
        return auditLogService.saveLog(log);
    }

    @DeleteMapping("/{id}")
    public void deleteLog(@PathVariable Long id) {
        auditLogService.deleteLog(id);
    }
}
